package com.reckue.post.transfers;

import com.reckue.post.utils.NodeContent;
import lombok.Data;

import java.util.List;

@Data
public class ListNodeResponse implements NodeContent {

    private List<String> content;
}
