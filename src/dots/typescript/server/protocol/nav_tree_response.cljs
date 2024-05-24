(ns dots.typescript.server.protocol.nav-tree-response
  (:refer-clojure :exclude [seq type]))

(defn body
  ^js [nav-tree-response]
  (.-body ^js nav-tree-response))

(defn set-body!
  ^js [nav-tree-response value]
  (set! (.-body ^js nav-tree-response) value))

(defn type
  ^js [nav-tree-response]
  (.-type ^js nav-tree-response))

(defn set-type!
  ^js [nav-tree-response value]
  (set! (.-type ^js nav-tree-response) value))

(defn request-seq
  "Sequence number of the request message."
  ^js [nav-tree-response]
  (.-request_seq ^js nav-tree-response))

(defn set-request-seq!
  "Sequence number of the request message."
  ^js [nav-tree-response value]
  (set! (.-request_seq ^js nav-tree-response) value))

(defn success?
  "Outcome of the request."
  ^js [nav-tree-response]
  (.-success ^js nav-tree-response))

(defn set-success!
  "Outcome of the request."
  ^js [nav-tree-response value]
  (set! (.-success ^js nav-tree-response) value))

(defn command
  "The command requested."
  ^js [nav-tree-response]
  (.-command ^js nav-tree-response))

(defn set-command!
  "The command requested."
  ^js [nav-tree-response value]
  (set! (.-command ^js nav-tree-response) value))

(defn message
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [nav-tree-response]
  (.-message ^js nav-tree-response))

(defn set-message!
  "If success === false, this should always be provided.
   Otherwise, may (or may not) contain a success message."
  ^js [nav-tree-response value]
  (set! (.-message ^js nav-tree-response) value))

(defn metadata
  "Contains extra information that plugin can include to be passed on"
  ^js [nav-tree-response]
  (.-metadata ^js nav-tree-response))

(defn set-metadata!
  "Contains extra information that plugin can include to be passed on"
  ^js [nav-tree-response value]
  (set! (.-metadata ^js nav-tree-response) value))

(defn performance-data
  "Exposes information about the performance of this request-response pair."
  ^js [nav-tree-response]
  (.-performanceData ^js nav-tree-response))

(defn set-performance-data!
  "Exposes information about the performance of this request-response pair."
  ^js [nav-tree-response value]
  (set! (.-performanceData ^js nav-tree-response) value))

(defn seq
  "Sequence number of the message"
  ^js [nav-tree-response]
  (.-seq ^js nav-tree-response))

(defn set-seq!
  "Sequence number of the message"
  ^js [nav-tree-response value]
  (set! (.-seq ^js nav-tree-response) value))
