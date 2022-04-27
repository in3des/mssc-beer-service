package guru.springframework.msscbeerservice.services;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import guru.springframework.msscbeerservice.web.model.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
//        return BeerDto.builder().build();
        return BeerDto.builder()
                .id(UUID.randomUUID())
//                .version(1)
//                .createdDate(OffsetDateTime.now())
//                .lastModifiedDate(OffsetDateTime.now())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.GOSE)
//                .upc(337010000002L)
//                .price(new BigDecimal("11.95"))
//                .quantityOnHand(15)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // todo impl - would add a real update beer
        log.debug("Updating a beer... id=" + beerId);
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        // todo impl - would delete a real beer
        log.debug("Deleting a beer...");
    }
}
