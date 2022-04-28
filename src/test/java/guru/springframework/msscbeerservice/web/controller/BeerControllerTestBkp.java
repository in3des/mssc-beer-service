//package guru.springframework.msscbeerservice.web.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import guru.springframework.msscbeerservice.services.BeerService;
//import guru.springframework.msscbeerservice.web.model.BeerDto;
//import guru.springframework.msscbeerservice.web.model.BeerStyleEnum;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.math.BigDecimal;
//import java.util.UUID;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
////@RunWith(SpringRunner.class)
//@WebMvcTest(BeerController.class)
//public class BeerControllerTestBkp {
//
//    @MockBean
//    BeerService beerService;
//
////    private String beerDtoJson;
//
//    @Autowired
//    MockMvc mockMvc;
//
//    @Autowired
//    ObjectMapper objectMapper;
//
//    BeerDto validBeer;
//
////    @BeforeEach
////    public void init() throws JsonProcessingException {
////        BeerDto beerDto = BeerDto.builder().build();
////        beerDtoJson = objectMapper.writeValueAsString(beerDto);
////    }
//
//
//    public BeerDto getValidBeerDto() {
//        return BeerDto.builder()
////                .id(UUID.randomUUID())
////                .version(1)
////                .createdDate(OffsetDateTime.now())
////                .lastModifiedDate(OffsetDateTime.now())
//                .beerName("Beer1")
//                .beerStyle(BeerStyleEnum.PALE_ALE)
//                .upc(1234567890L)
//                .price(new BigDecimal("11.95"))
////                .quantityOnHand(15)
//                .build();
//    }
//
//    @Test
//    public void getBeerById() throws Exception {
//
//        mockMvc.perform(get("/api/v1/beer/" + UUID.randomUUID()).accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    public void saveNewBeer() throws Exception {
//
//        BeerDto beerDto = getValidBeerDto();
//        String beerDtoJson = objectMapper.writeValueAsString(beerDto);
//
//        mockMvc.perform(post("/api/v1/beer")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(beerDtoJson))
//                .andExpect(status().isCreated());
//    }
//
//    @Test
//    public void updateBeerById() throws Exception {
//
//        //given
//        BeerDto beerDto = getValidBeerDto();
//        String beerDtoJson = objectMapper.writeValueAsString(beerDto);
//
//        //when
//        mockMvc.perform(post("/api/v1/beer" + UUID.randomUUID())
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(beerDtoJson))
//                .andExpect(status().isNoContent());
//
//    }
//}