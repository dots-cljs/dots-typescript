(ns dots.typescript.server.protocol.geterr-request-args
  "Arguments for geterr messages."
  (:refer-clojure :exclude [delay]))

(defn files
  "List of file names for which to compute compiler errors.
   The files will be checked in list order.
   
   **Returns:** `string[]`"
  ^js [geterr-request-args]
  (.-files ^js geterr-request-args))

(defn set-files!
  "List of file names for which to compute compiler errors.
   The files will be checked in list order."
  ^js [geterr-request-args value]
  (set! (.-files ^js geterr-request-args) value))

(defn delay
  "Delay in milliseconds to wait before starting to compute
   errors for the files in the file list
   
   **Returns:** `number`"
  ^js [geterr-request-args]
  (.-delay ^js geterr-request-args))

(defn set-delay!
  "Delay in milliseconds to wait before starting to compute
   errors for the files in the file list"
  ^js [geterr-request-args value]
  (set! (.-delay ^js geterr-request-args) value))
