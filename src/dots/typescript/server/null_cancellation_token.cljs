(ns dots.typescript.server.null-cancellation-token
  (:require ["typescript" :as typescript]))

(defn set-request
  "**Parameters:**
   - `request-id`: `number`
   
   **Returns:** `void`"
  ^js [request-id]
  (.. typescript/server -nullCancellationToken (setRequest request-id)))

(defn reset-request
  "**Parameters:**
   - `request-id`: `number`
   
   **Returns:** `void`"
  ^js [request-id]
  (.. typescript/server -nullCancellationToken (resetRequest request-id)))

(defn cancellation-requested?
  "**Returns:** `boolean`"
  ^js []
  (.. typescript/server -nullCancellationToken (isCancellationRequested)))
