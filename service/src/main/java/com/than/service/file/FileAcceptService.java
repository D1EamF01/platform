package com.than.service.file;

import com.than.base.Result;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Than
 * @package: com.than.service.file
 * @className: FileAcceptService
 * @description: 文件service
 * @date: 2023/8/30 21:41
 */
@Service
public class FileAcceptService {

    public Result fileUpload(MultipartFile file){

        // TODO: 2023/10/15 处理文件，将文件放入本地

        return new Result();
    }

}
