package com.itbootcamp.bgqa.nedelja4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class IspisUfajl {

    public static void main(String[] args) throws FileNotFoundException,
            IOException {
        String roba = "\nNOVI RED";
        FileOutputStream stream =
                new FileOutputStream(LocalDateTime.now().toString().replaceAll(":", ""));
        stream.write(roba.getBytes());
    }
}
