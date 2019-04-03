package com.nexo.server.Entity;

public class Tightening_Steps {
    private int row;
    private int column;
    private String name;
    private int category;
    private String result; //boolean?
    private String lastCmd;
    private int speed;
    private int torque;
    private int angle;
    private int duration;
    private int angleThresholdNom;
    private int angleThresholdAct;
    private int qualityCode;
    private String stepType;

    private Tightening_Functions tightening_functions;
    private Graph graph;
}
