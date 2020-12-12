package com.example.nico.esindexer;

import com.example.nico.esindexer.wsentity.CatResponseEntity;
import com.example.nico.esindexer.wsentity.ResultEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class LostCatController {

    @Autowired
    private LostCatService lostCatService;

    @GetMapping(value = "/lost-cat")
    public ResponseEntity<CatResponseEntity> getLostCat(@RequestParam(value = "size", defaultValue = "10") Long size, @RequestParam(value = "page", defaultValue = "0") Long page) {
        CatResponseEntity catEntity = lostCatService.getCatEntity(size, page);
        return ResponseEntity.ok(catEntity);
    }

    @GetMapping(value = "/lost-cat/all")
    public ResponseEntity<String> getAllLostCat() {
        Long pageSize = 50L;

        CatResponseEntity catEntity = lostCatService.getCatEntity(1L, 0L);
        Long catCount = Long.parseLong(catEntity.getData().getCount());
        Long pageCount = (catCount + pageSize - 1) / pageSize;

        List<ResultEntity> results = new ArrayList<>();
        for (Long i = 0L; i <= pageCount; i++) {
            System.out.println("Get data for page: " + i + "/" + pageCount + ".");
            CatResponseEntity cats = lostCatService.getCatEntity(pageSize, i);
            if (cats != null && cats.getData() != null) {
                results.addAll(cats.getData().getResults());
            } else {
                System.out.println("WARN: trop de tour de boucle. Plus de données.");
                break;
            }
        }

        System.out.println("Get data end!");

        FileOutputStream outStream = null;
        try {
            outStream = new FileOutputStream("C:\\Users\\nico7\\Documents\\formation elasticsearch\\elastic-project\\target\\cat.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ObjectMapper Obj = new ObjectMapper();
        for (int i = 0; i < results.size(); i++) {
            if (i % 500 == 0) {
                System.out.println("Write line i=" + i);
            }

            try {
                ResultEntity r = results.get(i);

                // premier element
                if (i == 0) {
                    byte[] strToBytes = ("[" + Obj.writeValueAsString(r) + ",\n").getBytes();
                    outStream.write(strToBytes);

                    // dernier element
                } else if (i == results.size() - 1) {
                    byte[] strToBytes = (Obj.writeValueAsString(r) + "]").getBytes();
                    outStream.write(strToBytes);
                } else {
                    byte[] strToBytes = (Obj.writeValueAsString(r) + ",\n").getBytes();
                    outStream.write(strToBytes);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            outStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ResponseEntity.ok("no content");
    }

}
