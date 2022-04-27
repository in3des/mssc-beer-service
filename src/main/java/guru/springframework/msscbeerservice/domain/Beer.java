package guru.springframework.msscbeerservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Beer {

    private UUID id;

    private Integer version;

    private Timestamp createdDate;
    private Timestamp lastModifiedDate;

    private String beerName;
    private String beerStyle;

    private Long upc;

    private BigDecimal price;

    private Integer minOnHand;
    private Integer quantityToBrew;
    private Integer quantityOnHand;

}
