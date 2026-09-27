package org.example.aispringboot.DTO.response;

import lombok.Data;

        /*"id": 71,
        "username": "string",
        "email": "string",
        "nickname": "string",
        "phone": "string",
        "gender": 0,
        "genderDisplayName": "未知",
        "userType": 1,
        "userTypeDisplayName": "普通用户",
        "status": 1,
        "statusDisplayName": "正常",
        "displayName": "string",
        "createdAt": "2026-03-06 21:17:50",
        "updatedAt": "2026-03-06 21:17:50"*/
        @Data
        public class UserLoginResponseDTO {
            private String token;
            private String roleType;
            private UserDetailResponseDTO userInfo;

            @Data
            public static class UserDetailResponseDTO {
                // 用户ID
                private Long id;
                // 用户名
                private String username;
                // 邮箱
                private String email;
                // 昵称
                private String nickname;
                // 头像
                private String avatar;
                // 手机号
                private String phone;
                // 性别 0:未知 1:男 2:女
                private Integer gender;
                // 性别显示名称
                private String genderDisplayName;
                // 生日
                private String birthday;
                // 用户类型 1:普通用户 2:管理员
                private Integer userType;
                // 用户类型显示名称
                private String userTypeDisplayName;
                // 状态 0:禁用 1:正常
                private Integer status;
                // 用户状态显示名称
                private String statusDisplayName;
                // 显示名称
                private String displayName;
                // 创建时间
                private String createdAt;
                // 更新时间
                private String updatedAt;
            }
        }
