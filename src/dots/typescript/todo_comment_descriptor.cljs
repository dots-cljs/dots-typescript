(ns dots.typescript.todo-comment-descriptor)

(defn text
  ^js [todo-comment-descriptor]
  (.-text ^js todo-comment-descriptor))

(defn set-text!
  ^js [todo-comment-descriptor value]
  (set! (.-text ^js todo-comment-descriptor) value))

(defn priority
  ^js [todo-comment-descriptor]
  (.-priority ^js todo-comment-descriptor))

(defn set-priority!
  ^js [todo-comment-descriptor value]
  (set! (.-priority ^js todo-comment-descriptor) value))
