package com.demo.humanresourcesmanagementsystem.Core.CloudRepo;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;


@Service
public class CloudinaryConfigration {

    @SuppressWarnings("unchecked")
    public Map<String, Object> upload(String file) {
        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dr86l8ihb",
                "api_key", "558868354686923",
                "api_secret", "xbVEJx4yeBE5KVw29KOx7WOzmAI"));
        try {
            @SuppressWarnings("rawtypes")
            Map params = ObjectUtils.asMap(
                    "folder", "cv/photos/",
                    "public_id", null,
                    "overwrite", true,
                    "notification_url", null,
                    "resource_type", "image"
            );
            return (Map<String, Object>) cloudinary.uploader().upload(file.getBytes(), params);
            //System.out.println(uploadResult.get("secure_url"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ObjectUtils.emptyMap();
    }


}