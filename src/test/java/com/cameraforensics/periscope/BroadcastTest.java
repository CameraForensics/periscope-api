package com.cameraforensics.periscope;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class BroadcastTest {

    @Test
    public void can_deserialize_broadcasts() throws JsonProcessingException {
        // given
        String videoJson = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/sample-search-results.json")))
                .lines().collect(Collectors.joining("\n"));

        ObjectMapper objectMapper = new ObjectMapper();

        // when
        Broadcast[] broadcasts = objectMapper.readValue(videoJson, Broadcast[].class);

        // then
        assertNotNull(broadcasts);
        assertEquals(140, broadcasts.length);

        Broadcast broadcast = broadcasts[1];
        assertEquals("Broadcast", broadcast.getClassName());
        assertEquals("1BdxYeNPNjlxX", broadcast.getId());
        assertEquals("Wed Oct 23 13:20:21 BST 2019", broadcast.getCreatedAt().toString());
        assertEquals("Wed Oct 23 18:12:19 BST 2019", broadcast.getUpdatedAt().toString());
        assertEquals("502903", broadcast.getUserId());
        assertEquals("ChantalTV", broadcast.getUserDisplayName());
        assertEquals("chantaltv", broadcast.getUsername());
        assertEquals("69523475", broadcast.getTwitterId());
        assertEquals("ChantalTV", broadcast.getTwitterUsername());
        assertEquals("https://prod-profile.pscp.tv/502903/a0c7ce85776d3de1c96d85c3785f7f1c-128.jpg", broadcast.getProfileImageUrl());
        assertEquals("ENDED", broadcast.getState());
        assertFalse(broadcast.getLocked());
        assertFalse(broadcast.getFriendChat());
        assertFalse(broadcast.getPrivateChat());
        assertEquals("en", broadcast.getLanguage());
        assertEquals(new Integer(58), broadcast.getVersion());
        assertEquals(new Integer(0), broadcast.getReplayEditedStartTime());
        assertEquals(new Integer(291), broadcast.getReplayEditedThumbnailTime());
        assertEquals("Wed Oct 23 13:21:35 BST 2019", broadcast.getStart().toString());
        assertEquals("Wed Oct 23 13:27:03 BST 2019", broadcast.getPing().toString());
        assertEquals("Wed Oct 23 13:27:07 BST 2019", broadcast.getEnd().toString());
        assertFalse(broadcast.getHasModeration());
        assertEquals("mod-502903", broadcast.getModeratorChannel());
        assertTrue(broadcast.getHasModerators());
        assertTrue(broadcast.getEnabledSparkles());
        assertTrue(broadcast.getHasLocation());
        assertEquals("Paris", broadcast.getCity());
        assertEquals("France", broadcast.getCountry());
        assertEquals("", broadcast.getCountryState());
        assertEquals("FR", broadcast.getCountryISOCode());
        assertEquals(new Double(48.86), broadcast.getIpLat());
        assertEquals(new Double(2.39), broadcast.getIpLng());
        assertEquals(new Integer(320), broadcast.getWidth());
        assertEquals(new Integer(568), broadcast.getHeight());
        assertEquals(new Integer(0), broadcast.getCameraRotation());
        assertEquals("https://prod-fastly-eu-west-3.video.pscp.tv/Transcoding/v1/replay_thumbnail/eu-west-3/periscope-replay-direct-prod-eu-west-3-public/eyJkIjowfQ/i4B3PUtK4pSlKWkWgEQIjvt90zbqO10WD1O95-FtCcKEE7N62_1Ur6e5duIHg3dbvE9wsLBadv6Jq-BbAyUzIg/chunk_1571833587287011728_147_a.jpg?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCIsInZlcnNpb24iOiIyIn0.eyJBbGxvd2VkUHJvdG9jb2xzIjpbInRodW1iIl0sIkJyb2FkY2FzdElkIjoiMUJkeFllTlBOamx4WCIsIkdyYW50VHlwZSI6InJlYWQiLCJHcmFudGVkQXQiOjE1NzIxMDg0NzAsIkdyYW50ZWRUbyI6IndlYi1kYjY2YWM5ZC1hYWZmLTQ3OTYtNzU1Mi03NjM1NjllYzVkYjUiLCJTdHJlYW1OYW1lIjoiaTRCM1BVdEs0cFNsS1drV2dFUUlqdnQ5MHpicU8xMFdEMU85NS1GdENjS0VFN042Ml8xVXI2ZTVkdUlIZzNkYnZFOXdzTEJhZHY2SnEtQmJBeVV6SWciLCJleHAiOjE1NzIyODEyNzB9.wt8lHy3TxWR6auHY3OoDe6tz5JS8zVtUBGyk9pB2XXs&service=proxsee&digest=vPy0BQtr2kkuEM17BrCM0l969FP_JNI1gHWsn4s0NGc", broadcast.getImageUrl());
        assertEquals("https://prod-fastly-eu-west-3.video.pscp.tv/Transcoding/v1/replay_thumbnail/eu-west-3/periscope-replay-direct-prod-eu-west-3-public/eyJkIjoxMjh9/i4B3PUtK4pSlKWkWgEQIjvt90zbqO10WD1O95-FtCcKEE7N62_1Ur6e5duIHg3dbvE9wsLBadv6Jq-BbAyUzIg/chunk_1571833587287011728_147_a.jpg?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCIsInZlcnNpb24iOiIyIn0.eyJBbGxvd2VkUHJvdG9jb2xzIjpbInRodW1iIl0sIkJyb2FkY2FzdElkIjoiMUJkeFllTlBOamx4WCIsIkdyYW50VHlwZSI6InJlYWQiLCJHcmFudGVkQXQiOjE1NzIxMDg0NzAsIkdyYW50ZWRUbyI6IndlYi1kYjY2YWM5ZC1hYWZmLTQ3OTYtNzU1Mi03NjM1NjllYzVkYjUiLCJTdHJlYW1OYW1lIjoiaTRCM1BVdEs0cFNsS1drV2dFUUlqdnQ5MHpicU8xMFdEMU85NS1GdENjS0VFN042Ml8xVXI2ZTVkdUlIZzNkYnZFOXdzTEJhZHY2SnEtQmJBeVV6SWciLCJleHAiOjE1NzIyODEyNzB9.wt8lHy3TxWR6auHY3OoDe6tz5JS8zVtUBGyk9pB2XXs&service=proxsee&digest=vPy0BQtr2kkuEM17BrCM0l969FP_JNI1gHWsn4s0NGc", broadcast.getImageUrlSmall());
        assertEquals("https://prod-fastly-eu-west-3.video.pscp.tv/Transcoding/v1/replay_thumbnail/eu-west-3/periscope-replay-direct-prod-eu-west-3-public/eyJkIjozNjB9/i4B3PUtK4pSlKWkWgEQIjvt90zbqO10WD1O95-FtCcKEE7N62_1Ur6e5duIHg3dbvE9wsLBadv6Jq-BbAyUzIg/chunk_1571833587287011728_147_a.jpg?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCIsInZlcnNpb24iOiIyIn0.eyJBbGxvd2VkUHJvdG9jb2xzIjpbInRodW1iIl0sIkJyb2FkY2FzdElkIjoiMUJkeFllTlBOamx4WCIsIkdyYW50VHlwZSI6InJlYWQiLCJHcmFudGVkQXQiOjE1NzIxMDg0NzAsIkdyYW50ZWRUbyI6IndlYi1kYjY2YWM5ZC1hYWZmLTQ3OTYtNzU1Mi03NjM1NjllYzVkYjUiLCJTdHJlYW1OYW1lIjoiaTRCM1BVdEs0cFNsS1drV2dFUUlqdnQ5MHpicU8xMFdEMU85NS1GdENjS0VFN042Ml8xVXI2ZTVkdUlIZzNkYnZFOXdzTEJhZHY2SnEtQmJBeVV6SWciLCJleHAiOjE1NzIyODEyNzB9.wt8lHy3TxWR6auHY3OoDe6tz5JS8zVtUBGyk9pB2XXs&service=proxsee&digest=vPy0BQtr2kkuEM17BrCM0l969FP_JNI1gHWsn4s0NGc", broadcast.getImageUrlMedium());
        assertEquals("Are you Père Lachaise 360° ready? #travel https://youtu.be/7mMWOv16lYQ", broadcast.getStatus());
        assertNotNull(broadcast.getTags());
        assertEquals(1, broadcast.getTags().size());
        assertEquals("travel", broadcast.getTags().get(0));
        assertEquals("video", broadcast.getContentType());
        assertEquals("periscope_ios_1.62.1", broadcast.getBroadcastSource());
        assertTrue(broadcast.getAvailableForReplay());
        assertEquals(new Integer(-1), broadcast.getExpiration());
        assertEquals("69523475", broadcast.getTwitterId());
        assertEquals("28_1186980679591976960", broadcast.getMediaKey());
        assertEquals(new Integer(0), broadcast.getSortScore());
        assertFalse(broadcast.getTrusted());
        assertEquals(new Integer(0), broadcast.getNumberTotalWatching());
        assertEquals(new Integer(0), broadcast.getNumberWatching());
        assertEquals(new Integer(0), broadcast.getNumberWebWatching());
    }

}
