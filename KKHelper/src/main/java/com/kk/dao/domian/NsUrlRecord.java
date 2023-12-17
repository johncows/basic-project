package com.kk.dao.domian;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("ns_url_record")
public class NsUrlRecord {
    @TableId
    private Integer id;

    private String bizId;
    private String gameName;
    private String aliUrl;
    private String aliPassword;
    private String baiduUrl;
    private String baiduPassword;

    @TableField("is_Valid")
    private Boolean valid;
}
