(ns dots.typescript.todo-comment)

(defn descriptor
  "**Returns:** `TodoCommentDescriptor`"
  ^js [todo-comment]
  (.-descriptor ^js todo-comment))

(defn set-descriptor!
  ^js [todo-comment value]
  (set! (.-descriptor ^js todo-comment) value))

(defn message
  "**Returns:** `string`"
  ^js [todo-comment]
  (.-message ^js todo-comment))

(defn set-message!
  ^js [todo-comment value]
  (set! (.-message ^js todo-comment) value))

(defn position
  "**Returns:** `number`"
  ^js [todo-comment]
  (.-position ^js todo-comment))

(defn set-position!
  ^js [todo-comment value]
  (set! (.-position ^js todo-comment) value))
