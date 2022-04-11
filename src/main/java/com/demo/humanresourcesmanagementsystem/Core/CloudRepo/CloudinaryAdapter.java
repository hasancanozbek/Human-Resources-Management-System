package com.demo.humanresourcesmanagementsystem.Core.CloudRepo;

import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CloudinaryAdapter implements CloudService {

    private Cloudinary cloudinary;

    @Autowired
    public CloudinaryAdapter() {
        this.cloudinary = new Cloudinary("cloudinary://558868354686923:xbVEJx4yeBE5KVw29KOx7WOzmAI@dr86l8ihb");
    }

    @Override
    public Map<String, Object> upload(String file) {
        CloudinaryConfigration cloudinaryUpload = new CloudinaryConfigration();
        return cloudinaryUpload.upload(file);
    }
}
