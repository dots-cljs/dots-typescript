(ns dots.typescript.server.protocol.close-external-project-request-args
  "Arguments to CloseExternalProjectRequest request")

(defn project-file-name
  "Name of the project to close"
  ^js [close-external-project-request-args]
  (.-projectFileName ^js close-external-project-request-args))

(defn set-project-file-name!
  "Name of the project to close"
  ^js [close-external-project-request-args value]
  (set! (.-projectFileName ^js close-external-project-request-args) value))
