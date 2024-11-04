
package entity;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

public class Event {
    private final UUID id;
    private final String title;
    private final String description;
    private final LocalDateTime startTime;
    private final Set<String> tags;
    private final String source;

}