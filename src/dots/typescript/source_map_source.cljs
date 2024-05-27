(ns dots.typescript.source-map-source)

(defn file-name
  "**Returns:** `string`"
  ^js [source-map-source]
  (.-fileName ^js source-map-source))

(defn set-file-name!
  ^js [source-map-source value]
  (set! (.-fileName ^js source-map-source) value))

(defn text
  "**Returns:** `string`"
  ^js [source-map-source]
  (.-text ^js source-map-source))

(defn set-text!
  ^js [source-map-source value]
  (set! (.-text ^js source-map-source) value))

(defn skip-trivia
  "**Returns:** `((pos: number) => number) | undefined`"
  ^js [source-map-source]
  (.-skipTrivia ^js source-map-source))

(defn set-skip-trivia!
  ^js [source-map-source value]
  (set! (.-skipTrivia ^js source-map-source) value))

(defn line-and-character-of-position
  "**Parameters:**
   - `pos`: `number`
   
   **Returns:** `LineAndCharacter`"
  ^js [source-map-source pos]
  (.getLineAndCharacterOfPosition ^js source-map-source pos))
