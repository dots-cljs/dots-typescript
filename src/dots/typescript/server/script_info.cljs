(ns dots.typescript.server.script-info)

(defn host
  "**Returns:** `any`"
  ^js [script-info]
  (.-host ^js script-info))

(defn file-name
  "**Returns:** `NormalizedPath`"
  ^js [script-info]
  (.-fileName ^js script-info))

(defn script-kind
  "**Returns:** `ScriptKind`"
  ^js [script-info]
  (.-scriptKind ^js script-info))

(defn has-mixed-content?
  "**Returns:** `boolean`"
  ^js [script-info]
  (.-hasMixedContent ^js script-info))

(defn path
  "**Returns:** `Path`"
  ^js [script-info]
  (.-path ^js script-info))

(defn containing-projects
  "All projects that include this file
   
   **Returns:** `Project[]`"
  ^js [script-info]
  (.-containingProjects ^js script-info))

(defn format-settings
  "**Returns:** `any`"
  ^js [script-info]
  (.-formatSettings ^js script-info))

(defn set-format-settings!
  ^js [script-info value]
  (set! (.-formatSettings ^js script-info) value))

(defn preferences
  "**Returns:** `any`"
  ^js [script-info]
  (.-preferences ^js script-info))

(defn set-preferences!
  ^js [script-info value]
  (set! (.-preferences ^js script-info) value))

(defn script-open?
  "**Returns:** `boolean`"
  ^js [script-info]
  (.isScriptOpen ^js script-info))

(defn open
  "**Parameters:**
   - `new-text`: `string | undefined`
   
   **Returns:** `void`"
  (^js [script-info]
   (.open ^js script-info))
  (^js [script-info new-text]
   (.open ^js script-info new-text)))

(defn close
  "**Parameters:**
   - `file-exists?`: `boolean | undefined`
   
   **Returns:** `void`"
  (^js [script-info]
   (.close ^js script-info))
  (^js [script-info file-exists?]
   (.close ^js script-info file-exists?)))

(defn snapshot
  "**Returns:** `IScriptSnapshot`"
  ^js [script-info]
  (.getSnapshot ^js script-info))

(defn ensure-real-path
  "**Returns:** `any`"
  ^js [script-info]
  (.-ensureRealPath ^js script-info))

(defn set-ensure-real-path!
  ^js [script-info value]
  (set! (.-ensureRealPath ^js script-info) value))

(defn format-code-settings
  "**Returns:** `FormatCodeSettings | undefined`"
  ^js [script-info]
  (.getFormatCodeSettings ^js script-info))

(defn get-preferences
  "**Returns:** `UserPreferences | undefined`"
  ^js [script-info]
  (.getPreferences ^js script-info))

(defn attach-to-project?
  "**Parameters:**
   - `project`: `Project`
   
   **Returns:** `boolean`"
  ^js [script-info project]
  (.attachToProject ^js script-info project))

(defn attached?
  "**Parameters:**
   - `project`: `Project`
   
   **Returns:** `boolean`"
  ^js [script-info project]
  (.isAttached ^js script-info project))

(defn detach-from-project
  "**Parameters:**
   - `project`: `Project`
   
   **Returns:** `void`"
  ^js [script-info project]
  (.detachFromProject ^js script-info project))

(defn detach-all-projects
  "**Returns:** `void`"
  ^js [script-info]
  (.detachAllProjects ^js script-info))

(defn default-project
  "**Returns:** `Project`"
  ^js [script-info]
  (.getDefaultProject ^js script-info))

(defn register-file-update
  "**Returns:** `void`"
  ^js [script-info]
  (.registerFileUpdate ^js script-info))

(defn set-options
  "**Parameters:**
   - `format-settings`: `FormatCodeSettings`
   - `preferences`: `UserPreferences | undefined`
   
   **Returns:** `void`"
  (^js [script-info format-settings]
   (.setOptions ^js script-info format-settings))
  (^js [script-info format-settings preferences]
   (.setOptions ^js script-info format-settings preferences)))

(defn latest-version
  "**Returns:** `string`"
  ^js [script-info]
  (.getLatestVersion ^js script-info))

(defn save-to
  "**Parameters:**
   - `file-name`: `string`
   
   **Returns:** `void`"
  ^js [script-info file-name]
  (.saveTo ^js script-info file-name))

(defn reload-from-file?
  "**Parameters:**
   - `temp-file-name`: `NormalizedPath | undefined`
   
   **Returns:** `boolean`"
  (^js [script-info]
   (.reloadFromFile ^js script-info))
  (^js [script-info temp-file-name]
   (.reloadFromFile ^js script-info temp-file-name)))

(defn edit-content
  "**Parameters:**
   - `start`: `number`
   - `end`: `number`
   - `new-text`: `string`
   
   **Returns:** `void`"
  ^js [script-info start end new-text]
  (.editContent ^js script-info start end new-text))

(defn mark-containing-projects-as-dirty
  "**Returns:** `void`"
  ^js [script-info]
  (.markContainingProjectsAsDirty ^js script-info))

(defn orphan?
  "**Returns:** `boolean`"
  ^js [script-info]
  (.isOrphan ^js script-info))

(defn line-to-text-span
  "**Parameters:**
   - `line`: `number` - 1 based index
   
   **Returns:** `TextSpan`"
  ^js [script-info line]
  (.lineToTextSpan ^js script-info line))

(defn line-offset-to-position
  "**Parameters:**
   - `line`: `number` - 1 based index
   - `offset`: `number` - 1 based index
   
   **Returns:** `number`"
  ^js [script-info line offset]
  (.lineOffsetToPosition ^js script-info line offset))

(defn position-to-line-offset
  "**Parameters:**
   - `position`: `number`
   
   **Returns:** `Location`"
  ^js [script-info position]
  (.positionToLineOffset ^js script-info position))

(defn java-script?
  "**Returns:** `boolean`"
  ^js [script-info]
  (.isJavaScript ^js script-info))
