(ns dots.typescript.server.protocol.todo-comment-request
  "A request to get TODO comments from the file"
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [todo-comment-request]
  (.-command ^js todo-comment-request))

(defn set-command!
  ^js [todo-comment-request value]
  (set! (.-command ^js todo-comment-request) value))

(defn arguments
  ^js [todo-comment-request]
  (.-arguments ^js todo-comment-request))

(defn set-arguments!
  ^js [todo-comment-request value]
  (set! (.-arguments ^js todo-comment-request) value))

(defn type
  ^js [todo-comment-request]
  (.-type ^js todo-comment-request))

(defn set-type!
  ^js [todo-comment-request value]
  (set! (.-type ^js todo-comment-request) value))

(defn seq
  "Sequence number of the message"
  ^js [todo-comment-request]
  (.-seq ^js todo-comment-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [todo-comment-request value]
  (set! (.-seq ^js todo-comment-request) value))
