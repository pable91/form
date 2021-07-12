package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
public class DeliveryCode {
    private String code;
    private String displayName;
}
