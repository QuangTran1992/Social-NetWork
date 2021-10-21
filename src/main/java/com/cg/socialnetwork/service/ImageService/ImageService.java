package com.cg.socialnetwork.service.ImageService;//package com.cg.service.ImageService;


import com.cg.socialnetwork.model.Image;


import com.cg.socialnetwork.repository.IImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImageService implements IImageService{
    @Autowired
    private IImageRepository iImageRepository;

    @Override
    public Iterable<Image> findAll() {
        return iImageRepository.findAll();
    }

    @Override
    public Optional<Image> findById(long id) {
        return iImageRepository.findById(id);
    }

    @Override
    public Image save(Image image) {
        return iImageRepository.save(image);
    }

    @Override
    public void deleteById(long id) {
    iImageRepository.deleteById(id);
    }
}
