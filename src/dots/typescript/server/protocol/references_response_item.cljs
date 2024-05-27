(ns dots.typescript.server.protocol.references-response-item)

(defn line-text
  "Text of line containing the reference. Including this
   with the response avoids latency of editor loading files
   to show text of reference line (the server already has loaded the referencing files).
   
   If {@link UserPreferences.disableLineTextInReferences } is enabled, the property won't be filled
   
   **Returns:** `string | undefined`"
  ^js [references-response-item]
  (.-lineText ^js references-response-item))

(defn set-line-text!
  "Text of line containing the reference. Including this
   with the response avoids latency of editor loading files
   to show text of reference line (the server already has loaded the referencing files).
   
   If {@link UserPreferences.disableLineTextInReferences } is enabled, the property won't be filled"
  ^js [references-response-item value]
  (set! (.-lineText ^js references-response-item) value))

(defn write-access?
  "True if reference is a write location, false otherwise.
   
   **Returns:** `boolean`"
  ^js [references-response-item]
  (.-isWriteAccess ^js references-response-item))

(defn set-is-write-access!
  "True if reference is a write location, false otherwise."
  ^js [references-response-item value]
  (set! (.-isWriteAccess ^js references-response-item) value))

(defn definition?
  "Present only if the search was triggered from a declaration.
   True indicates that the references refers to the same symbol
   (i.e. has the same meaning) as the declaration that began the
   search.
   
   **Returns:** `boolean | undefined`"
  ^js [references-response-item]
  (.-isDefinition ^js references-response-item))

(defn set-is-definition!
  "Present only if the search was triggered from a declaration.
   True indicates that the references refers to the same symbol
   (i.e. has the same meaning) as the declaration that began the
   search."
  ^js [references-response-item value]
  (set! (.-isDefinition ^js references-response-item) value))

(defn file
  "File containing text span.
   
   **Returns:** `string`"
  ^js [references-response-item]
  (.-file ^js references-response-item))

(defn set-file!
  "File containing text span."
  ^js [references-response-item value]
  (set! (.-file ^js references-response-item) value))

(defn start
  "First character of the definition.
   
   **Returns:** `Location`"
  ^js [references-response-item]
  (.-start ^js references-response-item))

(defn set-start!
  "First character of the definition."
  ^js [references-response-item value]
  (set! (.-start ^js references-response-item) value))

(defn end
  "One character past last character of the definition.
   
   **Returns:** `Location`"
  ^js [references-response-item]
  (.-end ^js references-response-item))

(defn set-end!
  "One character past last character of the definition."
  ^js [references-response-item value]
  (set! (.-end ^js references-response-item) value))

(defn context-start
  "**Returns:** `Location | undefined`"
  ^js [references-response-item]
  (.-contextStart ^js references-response-item))

(defn set-context-start!
  ^js [references-response-item value]
  (set! (.-contextStart ^js references-response-item) value))

(defn context-end
  "**Returns:** `Location | undefined`"
  ^js [references-response-item]
  (.-contextEnd ^js references-response-item))

(defn set-context-end!
  ^js [references-response-item value]
  (set! (.-contextEnd ^js references-response-item) value))
