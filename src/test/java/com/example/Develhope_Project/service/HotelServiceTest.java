package com.example.Develhope_Project.service;

import com.example.Develhope_Project.models.Hotel;
import com.example.Develhope_Project.repository.HotelRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

public class HotelServiceTest {
    @Mock //qui si crea un oggetto simulato di hotelRepository
    private HotelRepository hotelRepository;

    private HotelService hotelService;

    @BeforeEach // tale metodo verrà eseguito prima di ciascun test,
    // garantendo che le configurazioni o le inizializzazioni necessarie siano pronte
    // prima di iniziare a eseguire i test effettivi.
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        hotelService = new HotelService(hotelRepository);
    }

    @Test
    public void testGetAllHotel() {
        // Simulazione del  comportamento di hotelRepository.findAll()
        List<Hotel> mockHotels = Arrays.asList(new Hotel(1, "Hotel A"), new Hotel(2, "Hotel B"));
        when(hotelRepository.findAll()).thenReturn(mockHotels);

        List<Hotel> result = hotelService.getAllHotel();
        assertEquals(mockHotels, result);
    }

    @Test
    public void testGetHotelById() {
        // Simulazione del comportamento di  hotelRepository.findById()
        int hotelId = 1;
        Hotel mockHotel = new Hotel(hotelId, "Hotel A");
        when(hotelRepository.findById(hotelId)).thenReturn(Optional.of(mockHotel));

        Hotel result = hotelService.getHotelById(hotelId);
        assertEquals(mockHotel, result);

        // Test quando l'hotel non è trovato
        int nonExistentHotelId = 99;
        when(hotelRepository.findById(nonExistentHotelId)).thenReturn(Optional.empty());

        Hotel nonExistentResult = hotelService.getHotelById(nonExistentHotelId);
        assertNull(nonExistentResult);
    }

    @Test
    public void testAddHotel() {
        Hotel newHotel = new Hotel(3, "Hotel C");
        hotelService.addHotel(newHotel);

        // Verifica della chiamata del metodo salva di hotelRepository.
        Mockito.verify(hotelRepository).save(newHotel);
    }

    @Test
    public void testUpdateHotel() {
        int hotelId = 1;
        Hotel updatedHotel = new Hotel(hotelId, "Updated Hotel A");

        hotelService.updateHotel(hotelId, updatedHotel);

        // Verifica della chiamata del metodo salva di hotelRepository
        Mockito.verify(hotelRepository).save(updatedHotel);
    }

    @Test
    public void testDeleteHotel() {
        int hotelId = 1;
        hotelService.deleteHotel(hotelId);

        // Verifica che il metodo deleteById di hotelRepository sia stato chiamato.
        Mockito.verify(hotelRepository).deleteById(hotelId);
    }
}

//all'avvio dei test potrebbe apparire il messaggio : OpenJDK 64-Bit Server VM warning: Sharing is only
// supported for boot loader classes because bootstrap classpath has been appended.
// Non è errore critico per l'esecuzione dei test.
// Questo avviso solitamente è legato all'uso di class sharing (una funzionalità introdotta in Java 10)
// che potrebbe non essere completamente supportata nell'ambiente in cui si eseguendo i test.