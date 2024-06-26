(ns dots.typescript.server.compressed-data)

(defn length
  "**Returns:** `number`"
  ^js [compressed-data]
  (.-length ^js compressed-data))

(defn set-length!
  ^js [compressed-data value]
  (set! (.-length ^js compressed-data) value))

(defn compression-kind
  "**Returns:** `string`"
  ^js [compressed-data]
  (.-compressionKind ^js compressed-data))

(defn set-compression-kind!
  ^js [compressed-data value]
  (set! (.-compressionKind ^js compressed-data) value))

(defn data
  "**Returns:** `any`"
  ^js [compressed-data]
  (.-data ^js compressed-data))

(defn set-data!
  ^js [compressed-data value]
  (set! (.-data ^js compressed-data) value))
