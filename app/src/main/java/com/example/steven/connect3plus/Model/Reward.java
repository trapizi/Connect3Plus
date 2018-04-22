package com.example.steven.connect3plus.Model;

public class Reward {
    private String RewardId;
    private String RewardLocation;
    private String RewardProvider;
    private String RewardInfo;
    private String RewardExpDate;
    private String RewardStatus;

    public Reward(String rewardId, String rewardLocation, String rewardProvider, String rewardInfo, String rewardExpDate, String rewardStatus) {
        RewardId = rewardId;
        RewardLocation = rewardLocation;
        RewardProvider = rewardProvider;
        RewardInfo = rewardInfo;
        RewardExpDate = rewardExpDate;
        RewardStatus = rewardStatus;
    }

    public String getRewardId() {
        return RewardId;
    }

    public void setRewardId(String rewardId) {
        RewardId = rewardId;
    }

    public String getRewardLocation() {
        return RewardLocation;
    }

    public void setRewardLocation(String rewardLocation) {
        RewardLocation = rewardLocation;
    }

    public String getRewardProvider() {
        return RewardProvider;
    }

    public void setRewardProvider(String rewardProvider) {
        RewardProvider = rewardProvider;
    }

    public String getRewardInfo() {
        return RewardInfo;
    }

    public void setRewardInfo(String rewardInfo) {
        RewardInfo = rewardInfo;
    }

    public String getRewardExpDate() {
        return RewardExpDate;
    }

    public void setRewardExpDate(String rewardExpDate) {
        RewardExpDate = rewardExpDate;
    }

    public String getRewardStatus() {
        return RewardStatus;
    }

    public void setRewardStatus(String rewardStatus) {
        RewardStatus = rewardStatus;
    }
}
