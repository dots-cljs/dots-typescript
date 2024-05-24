(ns dots.typescript.server.protocol.project-info-request-args
  "Arguments for ProjectInfoRequest request.")

(defn need-file-name-list?
  "Indicate if the file name list of the project is needed"
  ^js [project-info-request-args]
  (.-needFileNameList ^js project-info-request-args))

(defn set-need-file-name-list!
  "Indicate if the file name list of the project is needed"
  ^js [project-info-request-args value]
  (set! (.-needFileNameList ^js project-info-request-args) value))

(defn file
  "The file for the request (absolute pathname required)."
  ^js [project-info-request-args]
  (.-file ^js project-info-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [project-info-request-args value]
  (set! (.-file ^js project-info-request-args) value))

(defn project-file-name
  ^js [project-info-request-args]
  (.-projectFileName ^js project-info-request-args))

(defn set-project-file-name!
  ^js [project-info-request-args value]
  (set! (.-projectFileName ^js project-info-request-args) value))
