(ns dots.typescript.server.protocol.geterr-for-project-request-args
  "Arguments for GeterrForProject request."
  (:refer-clojure :exclude [delay]))

(defn file
  "the file requesting project error list
   
   **Returns:** `string`"
  ^js [geterr-for-project-request-args]
  (.-file ^js geterr-for-project-request-args))

(defn set-file!
  "the file requesting project error list"
  ^js [geterr-for-project-request-args value]
  (set! (.-file ^js geterr-for-project-request-args) value))

(defn delay
  "Delay in milliseconds to wait before starting to compute
   errors for the files in the file list
   
   **Returns:** `number`"
  ^js [geterr-for-project-request-args]
  (.-delay ^js geterr-for-project-request-args))

(defn set-delay!
  "Delay in milliseconds to wait before starting to compute
   errors for the files in the file list"
  ^js [geterr-for-project-request-args value]
  (set! (.-delay ^js geterr-for-project-request-args) value))
