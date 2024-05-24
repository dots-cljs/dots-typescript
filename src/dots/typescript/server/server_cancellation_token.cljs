(ns dots.typescript.server.server-cancellation-token)

(defn set-request
  "**Parameters:**
   - `request-id`: `number`
   
   **Returns:** `void`"
  ^js [server-cancellation-token request-id]
  (.setRequest ^js server-cancellation-token request-id))

(defn reset-request
  "**Parameters:**
   - `request-id`: `number`
   
   **Returns:** `void`"
  ^js [server-cancellation-token request-id]
  (.resetRequest ^js server-cancellation-token request-id))

(defn cancellation-requested?
  "**Returns:** `boolean`"
  ^js [server-cancellation-token]
  (.isCancellationRequested ^js server-cancellation-token))
