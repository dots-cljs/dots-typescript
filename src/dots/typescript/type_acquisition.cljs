(ns dots.typescript.type-acquisition)

(defn enable?
  "**Returns:** `boolean | undefined`"
  ^js [type-acquisition]
  (.-enable ^js type-acquisition))

(defn set-enable!
  ^js [type-acquisition value]
  (set! (.-enable ^js type-acquisition) value))

(defn include
  "**Returns:** `string[] | undefined`"
  ^js [type-acquisition]
  (.-include ^js type-acquisition))

(defn set-include!
  ^js [type-acquisition value]
  (set! (.-include ^js type-acquisition) value))

(defn exclude
  "**Returns:** `string[] | undefined`"
  ^js [type-acquisition]
  (.-exclude ^js type-acquisition))

(defn set-exclude!
  ^js [type-acquisition value]
  (set! (.-exclude ^js type-acquisition) value))

(defn disable-filename-based-type-acquisition?
  "**Returns:** `boolean | undefined`"
  ^js [type-acquisition]
  (.-disableFilenameBasedTypeAcquisition ^js type-acquisition))

(defn set-disable-filename-based-type-acquisition!
  ^js [type-acquisition value]
  (set! (.-disableFilenameBasedTypeAcquisition ^js type-acquisition) value))
