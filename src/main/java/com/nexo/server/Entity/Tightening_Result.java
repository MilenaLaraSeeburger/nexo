package com.nexo.server.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Tightening_Result {

    private String date;
    private String channel;
    private int nr;
    private int cellId;
    private int toolSerial;
    private int nominalTorque;
    private String torqueUnit;
    private int MCEFactor;
    private int cycle;
    private int idCode;
    private int jobNr;
    private int prgNr;
    private String prgName;
    private int prgDate;
    private String result; //boolean?
    private int qualityCode;
    private int totalTime;
    private int reworkCode;
    private String reworkText;
    private String lastCmd;
    private int batchNr;
    private int batchDirectionOK;
    private int batchDirectionNOK;
    private int batchCanceled; //boolean?
    private int batchMaxOK;
    private int batchOK;
    private int batchMaxNOK;
    private int batchNOK;
    private int batchValid;
    private String hardware;
    private int macO;
    private int ipO;
    private String swVersion;
    private String swBuild;
    private int totalAangleThresholdNom;
    private int totalAngleThresholdAact;
    private int totalAngle;
    private int lastStepColumn;
    private int lastStepRow;

    private Tightening_Steps tightening_steps;

    public String getDate() {
        return date;
    }

    public String getChannel() {
        return channel;
    }

    public int getNr() {
        return nr;
    }

    public int getCellId() {
        return cellId;
    }

    public int getToolSerial() {
        return toolSerial;
    }

    public int getNominalTorque() {
        return nominalTorque;
    }

    public String getTorqueUnit() {
        return torqueUnit;
    }

    public int getMCEFactor() {
        return MCEFactor;
    }

    public int getCycle() {
        return cycle;
    }

    public int getIdCode() {
        return idCode;
    }

    public int getJobNr() {
        return jobNr;
    }

    public int getPrgNr() {
        return prgNr;
    }

    public String getPrgName() {
        return prgName;
    }

    public int getPrgDate() {
        return prgDate;
    }

    public String getResult() {
        return result;
    }

    public int getQualityCode() {
        return qualityCode;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public int getReworkCode() {
        return reworkCode;
    }

    public String getReworkText() {
        return reworkText;
    }

    public String getLastCmd() {
        return lastCmd;
    }

    public int getBatchNr() {
        return batchNr;
    }

    public int getBatchDirectionOK() {
        return batchDirectionOK;
    }

    public int getBatchDirectionNOK() {
        return batchDirectionNOK;
    }

    public int getBatchCanceled() {
        return batchCanceled;
    }

    public int getBatchMaxOK() {
        return batchMaxOK;
    }

    public int getBatchOK() {
        return batchOK;
    }

    public int getBatchMaxNOK() {
        return batchMaxNOK;
    }

    public int getBatchNOK() {
        return batchNOK;
    }

    public int getBatchValid() {
        return batchValid;
    }

    public String getHardware() {
        return hardware;
    }

    public int getMacO() {
        return macO;
    }

    public int getIpO() {
        return ipO;
    }

    public String getSwVersion() {
        return swVersion;
    }

    public String getSwBuild() {
        return swBuild;
    }

    public int getTotalAangleThresholdNom() {
        return totalAangleThresholdNom;
    }

    public int getTotalAngleThresholdAact() {
        return totalAngleThresholdAact;
    }

    public int getTotalAngle() {
        return totalAngle;
    }

    public int getLastStepColumn() {
        return lastStepColumn;
    }

    public int getLastStepRow() {
        return lastStepRow;
    }

    public Tightening_Steps getTightening_steps() {
        return tightening_steps;
    }
}
