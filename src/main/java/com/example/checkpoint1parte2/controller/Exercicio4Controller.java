package com.example.checkpoint1parte2.controller;

import com.example.checkpoint1parte2.Entity.Exercicio4;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/exercicio4")
public class Exercicio4Controller {

    @PostMapping("/is-palindrome")
    public Exercicio4 isPalindrome(@RequestBody Exercicio4 entity) {
        String entradaNormal = entity.getInput();
        String entradaInvertida = "";

        // remove espaços em branco
        entradaNormal = entradaNormal.replaceAll(" ", "");

        // remove pontuação
        entradaNormal = entradaNormal.replaceAll("[,.!?]", "");

        // converte todas as letras para minúsculas
        entradaNormal = entradaNormal.toLowerCase();

        // inverte a entrada
        for (int i = entradaNormal.length() - 1; i >= 0; --i) {
            entradaInvertida += entradaNormal.charAt(i);
        }

        // compara a entrada normal e invertida
        if (entradaNormal.equals(entradaInvertida)) {
            entity.setResult("Palíndromo!");
        } else {
            entity.setResult("Não é Palíndromo!");
        }

        return entity;
    }

    @PostMapping("/single-number")
    public int findSingleNumber(@RequestBody int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

}
