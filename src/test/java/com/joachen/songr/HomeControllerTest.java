package com.joachen.songr;

import com.joachen.songr.controllers.HomeController;
import org.junit.Test;

import static org.junit.Assert.*;

public class HomeControllerTest {

    @Test
    public void reverse () {
        assertEquals("reversed is This", HomeController.reverse("This is reversed"));
    }

}