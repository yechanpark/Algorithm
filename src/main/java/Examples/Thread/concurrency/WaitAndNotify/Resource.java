package Examples.Thread.concurrency.WaitAndNotify;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Resource {
    private int id;
    private String value;
}
