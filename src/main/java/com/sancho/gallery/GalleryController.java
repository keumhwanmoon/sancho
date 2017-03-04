package com.sancho.gallery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jason, Moon
 * @since 2017-03-04.
 */
@Controller
public class GalleryController {

    @GetMapping("/gallery")
    public ModelAndView getPhotoPage() {
        return new ModelAndView("gallery/gallery");
    }
}
