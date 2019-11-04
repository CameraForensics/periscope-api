package com.cameraforensics.periscope;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void can_deserialize_user() throws JsonProcessingException {
        // given
        String json = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/sample-user.json")))
                .lines().collect(Collectors.joining("\n"));

        ObjectMapper objectMapper = new ObjectMapper();

        // when
        UserSearchResult result = objectMapper.readValue(json, UserSearchResult.class);
        // then
        assertNotNull(result);
        assertNotNull(result.getUser());

        User user = result.getUser();
        assertFalse(user.getBetaUser());
        assertEquals("User", user.getClassName());
        assertEquals("Mon Apr 10 21:35:04 BST 2017", user.getCreatedAt().toString());
        assertEquals("حساب رسمي | يعرض أعمال الاستديوهات التعليمية بإدارات التعليم بالمملكة العربية السعودية إشراف الإدارة العامة للإعلام والاتصال بوزارة التعليم pcmedia@mov.gov.sa", user.getDescription());
        assertEquals("مركز الإنتاج", user.getDisplayName());
        assertFalse(user.getEmployee());
        assertEquals("1PXEdmmkWBqQe", user.getId());
        assertEquals("", user.getInitials());
        assertEquals(new Integer(4), user.getNumberFollowing());
        assertEquals(new Integer(2432), user.getNumberOfFollowers());
        assertEquals(new Long(1985451), user.getNumberOfHearts());
        assertNotNull(user.getProfileImageUrls());
        assertEquals(3, user.getProfileImageUrls().size());

        Image image1 = user.getProfileImageUrls().get(0);
        assertEquals("http://pbs.twimg.com/profile_images/884081370766725121/rb7Y4ZpX_reasonably_small.jpg", image1.getUrl());
        assertEquals("https://pbs.twimg.com/profile_images/884081370766725121/rb7Y4ZpX_reasonably_small.jpg", image1.getSslUrl());
        assertEquals(new Integer(128), image1.getWidth());
        assertEquals(new Integer(128), image1.getHeight());

        Image image2 = user.getProfileImageUrls().get(1);
        assertEquals("http://pbs.twimg.com/profile_images/884081370766725121/rb7Y4ZpX_200x200.jpg", image2.getUrl());
        assertEquals("https://pbs.twimg.com/profile_images/884081370766725121/rb7Y4ZpX_200x200.jpg", image2.getSslUrl());
        assertEquals(new Integer(200), image2.getWidth());
        assertEquals(new Integer(200), image2.getHeight());

        Image image3 = user.getProfileImageUrls().get(2);
        assertEquals("http://pbs.twimg.com/profile_images/884081370766725121/rb7Y4ZpX_400x400.jpg", image3.getUrl());
        assertEquals("https://pbs.twimg.com/profile_images/884081370766725121/rb7Y4ZpX_400x400.jpg", image3.getSslUrl());
        assertEquals(new Integer(400), image3.getWidth());
        assertEquals(new Integer(400), image3.getHeight());

        assertEquals("155295929", user.getTwitterId());
        assertEquals("p_c_media_sa", user.getTwitterScreenName());
        assertTrue(user.getTwitterVerified());
        assertEquals("p_c_media_sa", user.getUsername());

    }

}
