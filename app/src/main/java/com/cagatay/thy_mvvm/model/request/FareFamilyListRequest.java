package com.cagatay.thy_mvvm.model.request;

import java.util.List;

public class FareFamilyListRequest {

    public List<String> portList;
    public String isMilesRequest;

    public FareFamilyListRequest(List<String> portList, String isMilesRequest) {
        this.portList = portList;
        this.isMilesRequest = isMilesRequest;
    }

    public FareFamilyListRequest(){}

    public List<String> getPortList() {
        return portList;
    }

    public void setPortList(List<String> portList) {
        this.portList = portList;
    }

    public String getIsMilesRequest() {
        return isMilesRequest;
    }

    public void setIsMilesRequest(String isMilesRequest) {
        this.isMilesRequest = isMilesRequest;
    }
}
