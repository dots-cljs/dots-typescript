(ns dots.typescript.server.protocol.todo-comment-request-args
  "Arguments for TodoCommentRequest request.")

(defn descriptors
  "Array of target TodoCommentDescriptors that describes TODO comments to be found"
  ^js [todo-comment-request-args]
  (.-descriptors ^js todo-comment-request-args))

(defn set-descriptors!
  "Array of target TodoCommentDescriptors that describes TODO comments to be found"
  ^js [todo-comment-request-args value]
  (set! (.-descriptors ^js todo-comment-request-args) value))

(defn file
  "The file for the request (absolute pathname required)."
  ^js [todo-comment-request-args]
  (.-file ^js todo-comment-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [todo-comment-request-args value]
  (set! (.-file ^js todo-comment-request-args) value))

(defn project-file-name
  ^js [todo-comment-request-args]
  (.-projectFileName ^js todo-comment-request-args))

(defn set-project-file-name!
  ^js [todo-comment-request-args value]
  (set! (.-projectFileName ^js todo-comment-request-args) value))
