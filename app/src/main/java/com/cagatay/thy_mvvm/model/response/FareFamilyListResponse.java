package com.cagatay.thy_mvvm.model.response;

import java.util.List;

public class FareFamilyListResponse {

    public String status;
    public String requestId;
    public Message message;
    public Data data;

    public class Message{
        public String code;
        public String description;
    }

    public class FareFamilyInfo{
        public String fareFamilyDescription;
        public String fareFamilyGroup;
        public String fareFamilyKey;
    }

    public class FareFamilyList{
        public List<FareFamilyInfo> fareFamilyInfo;
    }

    public class FareFamilyOTAResponse{
        public FareFamilyList fareFamilyList;
        public String isDomestic;
    }

    public class Data{
        public FareFamilyOTAResponse fareFamilyOTAResponse;
    }
}
