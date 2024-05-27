(ns dots.typescript.server.protocol.watch-change-request-args)

(defn id
  "**Returns:** `number`"
  ^js [watch-change-request-args]
  (.-id ^js watch-change-request-args))

(defn set-id!
  ^js [watch-change-request-args value]
  (set! (.-id ^js watch-change-request-args) value))

(defn created
  "**Returns:** `string[] | undefined`"
  ^js [watch-change-request-args]
  (.-created ^js watch-change-request-args))

(defn set-created!
  ^js [watch-change-request-args value]
  (set! (.-created ^js watch-change-request-args) value))

(defn deleted
  "**Returns:** `string[] | undefined`"
  ^js [watch-change-request-args]
  (.-deleted ^js watch-change-request-args))

(defn set-deleted!
  ^js [watch-change-request-args value]
  (set! (.-deleted ^js watch-change-request-args) value))

(defn updated
  "**Returns:** `string[] | undefined`"
  ^js [watch-change-request-args]
  (.-updated ^js watch-change-request-args))

(defn set-updated!
  ^js [watch-change-request-args value]
  (set! (.-updated ^js watch-change-request-args) value))
