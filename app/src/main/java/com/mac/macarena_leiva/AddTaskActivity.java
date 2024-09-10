package com.mac.macarena_leiva;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;

public class AddTaskActivity extends Activity {
    private EditText taskNameEditText;
    private RadioGroup priorityRadioGroup;
    private ProgressBar progressBar;
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        taskNameEditText = findViewById(R.id.task_name);
        priorityRadioGroup = findViewById(R.id.radioGroup);
        progressBar = findViewById(R.id.progressBar);
        ratingBar = findViewById(R.id.ratingBar);
    }

    public void onSaveTaskClicked(View view) {
        String taskName = taskNameEditText.getText().toString();
        int selectedPriorityId = priorityRadioGroup.getCheckedRadioButtonId();
        RadioButton selectedPriorityButton = findViewById(selectedPriorityId);
        String priority = selectedPriorityButton != null ? selectedPriorityButton.getText().toString() : "No definido";
        int progress = progressBar.getProgress();
        float importance = ratingBar.getRating();

        Intent resultIntent = new Intent();
        resultIntent.putExtra("taskName", taskName);
        resultIntent.putExtra("priority", priority);
        resultIntent.putExtra("progress", progress);
        resultIntent.putExtra("importance", importance);
        setResult(RESULT_OK, resultIntent);
        finish();
    }
}
