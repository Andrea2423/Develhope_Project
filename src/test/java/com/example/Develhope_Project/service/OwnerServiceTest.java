package com.example.Develhope_Project.service;

import com.example.Develhope_Project.models.Owner;
import com.example.Develhope_Project.repository.OwnerRepository;
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
/*
public class OwnerServiceTest {
    @Mock
    private OwnerRepository ownerRepository;

    private OwnerService ownerService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        ownerService = new OwnerService(ownerRepository);
    }

    @Test
    public void testGetAllOwners() {
        List<Owner> mockOwners = Arrays.asList(
                new Owner("Riccardo", "Address 1", "richi@example.com", "123456789", null, null),
                new Owner("Eleonora", "Address 2", "ele@example.com", "987654321", null, null)
        );

        when(ownerRepository.findAll()).thenReturn(mockOwners);

        List<Owner> result = ownerService.getAllOwners();
        assertEquals(mockOwners, result);
    }

    @Test
    public void testGetOwnerById() {
        int ownerId = 1;
        Owner mockOwner = new Owner("Riccardo", "Address 1", "richi@example.com",
                "123456789", null, null);
        mockOwner.setId(ownerId);

        when(ownerRepository.findById(ownerId)).thenReturn(Optional.of(mockOwner));

        Owner result = ownerService.getOwnersById(ownerId);
        assertEquals(mockOwner, result);

        int nonExistentOwnerId = 99;
        when(ownerRepository.findById(nonExistentOwnerId)).thenReturn(Optional.empty());

        Owner nonExistentResult = ownerService.getOwnersById(nonExistentOwnerId);
        assertNull(nonExistentResult);
    }

    @Test
    public void testAddOwner() {
        Owner newOwner = new Owner("Pippo", "Address 3", "pippo@example.com", "555555555", null, null);
        ownerService.addOwners(newOwner);

        Mockito.verify(ownerRepository).save(newOwner);
    }

    @Test
    public void testUpdateOwner() {
        int ownerId = 1;
        Owner updatedOwner = new Owner("Updated Riccardo", "Updated Address", "updated@example.com", "999999999", null, null);
        updatedOwner.setId(ownerId);

        ownerService.updateOwners(ownerId, updatedOwner);

        Mockito.verify(ownerRepository).save(updatedOwner);
    }

    @Test
    public void testDeleteOwner() {
        int ownerId = 1;
        ownerService.deleteOwners(ownerId);

        Mockito.verify(ownerRepository).deleteById(ownerId);
    }
}

 */
