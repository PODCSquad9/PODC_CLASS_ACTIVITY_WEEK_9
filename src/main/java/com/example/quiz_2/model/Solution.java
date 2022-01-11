package com.example.quiz_2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Solution {
    private Long id;
    private String name;
    private String questionTitle;

}
