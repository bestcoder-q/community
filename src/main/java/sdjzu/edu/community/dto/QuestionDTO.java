package sdjzu.edu.community.dto;

import lombok.Data;
import sdjzu.edu.community.model.User;

/**
 * Created by Lwq on 2020/2/25 22:32
 */
@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private String tag;
    private User user;

}
