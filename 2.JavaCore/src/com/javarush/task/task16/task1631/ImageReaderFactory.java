package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.ImageReader;
import com.javarush.task.task16.task1631.common.ImageTypes;
import com.javarush.task.task16.task1631.common.JpgReader;
import com.javarush.task.task16.task1631.common.BmpReader;
import com.javarush.task.task16.task1631.common.PngReader;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes type) {
        ImageReader result = null;
        try {
            if(type == null) {throw new IllegalArgumentException("Неизвестный тип картинки");}
            switch ( type ) {
                case JPG:
                    return new JpgReader();
                case BMP:
                    return new BmpReader();
                case PNG:
                    return new PngReader();
            }
        }
        catch (Exception e) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return result;
    }
}
