package com.ani.logging.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/data")
public class DataController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/read")
    public String read() {
        logger.info("success");
        return  "reading data from PLC Panel";
    }

    @GetMapping("/interlock/{sts}")
    public String interlock(@PathVariable Boolean sts) {
        if(sts) {
            logger.info("success");
            return  "reading data in write mode";
        } else {
            RuntimeException ex = new RuntimeException("PLC Interlocked");
            logger.error("interlocked", ex);
            throw ex;
        }
    }
}
