package foodify.orchestrator.domain.orm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Establishment {
    private String id;
    private String name;
    private String address;
    private List<String> menuItems;
}
