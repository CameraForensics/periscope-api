package com.cameraforensics.periscope;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class PeriscopeTest {

    private Periscope periscope = new Periscope();

    @Test
    public void test_search_broadcasts() throws IOException {
        // when
        List<Broadcast> broadcasts = periscope.broadcastSearchPublic("live");

        // then
        assertNotNull(broadcasts);
        assertTrue(broadcasts.size() > 0);
    }

    @Test
    public void test_get_video() throws IOException {
        // given
        List<Broadcast> broadcasts = periscope.broadcastSearchPublic("live");
        assertNotNull(broadcasts);
        assertTrue(broadcasts.size() > 0);

        String broadcastId = broadcasts.get(0).getId();

        // when
        Video video = periscope.accessVideoPublic(broadcastId);

        // then
        assertNotNull(video);
        assertEquals(broadcastId, video.getBroadcast().getId());
    }

    @Test
    public void test_get_user() throws IOException {
        // given
        List<Broadcast> broadcasts = periscope.broadcastSearchPublic("live");
        assertNotNull(broadcasts);
        assertTrue(broadcasts.size() > 0);

        String userId = broadcasts.get(0).getUserId();

        // when
        User user = periscope.getUserPublic(userId);
        assertNotNull(user);
        assertEquals(userId, user.getId());

    }

}
