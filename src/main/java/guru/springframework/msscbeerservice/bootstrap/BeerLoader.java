package guru.springframework.msscbeerservice.bootstrap;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObject();
    }

    private void loadBeerObject() {
        if (beerRepository.count() == 0) {

            beerRepository.save(Beer.builder()
                            .beerName("Mango Bobs")
                            .beerStyle("STOUT")
                            .quantityToBrew(200)
                            .minOnHand(12)
                            .quantityToBrew(30)
                            .quantityOnHand(15)
                            .upc(337010000001L)
                            .price(new BigDecimal("12.95"))
                            .version(1)
//                            .createDate(OffsetDateTime.now())
                            .createdDate(new Timestamp(System.currentTimeMillis()))
//                            .lastModifiedDate(OffsetDateTime.now())
                            .lastModifiedDate(new Timestamp(System.currentTimeMillis()))
                            .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .quantityToBrew(30)
                    .quantityOnHand(15)
                    .upc(337010000002L)
                    .price(new BigDecimal("11.95"))
                    .version(1)
//                    .createDate(OffsetDateTime.now())
                    .createdDate(new Timestamp(System.currentTimeMillis()))
//                    .lastModifiedDate(OffsetDateTime.now())
                    .lastModifiedDate(new Timestamp(System.currentTimeMillis()))
                    .build());

        }

//        System.out.println("Loaded Beers: " + beerRepository.count());

    }
}
