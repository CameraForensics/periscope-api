# periscope-api

An EXPERIMENTAL Java implementation of the periscope public access endpoints.

## How do I build it?

```
$ ./gradlew clean build
```

## The API

### 1. Search public broadcasts

```
Periscope periscope = new Periscope();
List<Broadcast> broadcasts = periscope.broadcastSearchPublic(searchTerm);
```

### 2. Retrieve a Video based on a Broadcast

```
Broadcast broadcast ...;
Video video = periscope.accessVideoPublic(broadcast.getId());
```

### 2. Download a broadcast

```
Video video ...;
VideoContent content = periscope.downloadVideo(video);
```