package guru.springframework.msscbeerservice.services.v2;

import guru.springframework.msscbeerservice.web.model.v2.BeerDtoV2;
import guru.springframework.msscbeerservice.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {


    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.STOUT)
                .upc(100001L)
                .price(BigDecimal.valueOf(12.95))
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        // todo impl - would add a real update beer
        log.debug("Updating a beer... id=" + beerId);
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        // todo impl - would delete a real beer
        log.debug("Deleting a beer...");
    }
}
